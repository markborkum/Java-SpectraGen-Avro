package gov.pnnl.emsl.magres.spectra_gen.impl;

import gov.pnnl.emsl.magres.spectra_gen.Data;
import gov.pnnl.emsl.magres.spectra_gen.Message;
import gov.pnnl.emsl.magres.spectra_gen.Nucleus;
import gov.pnnl.emsl.magres.spectra_gen.Parameters;
import gov.pnnl.emsl.magres.spectra_gen.Scan;
import gov.pnnl.emsl.magres.spectra_gen.SpectraGen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import org.apache.avro.AvroRemoteException;

/**
 * Implementation of {@link SpectraGen} interface.
 * 
 * @author bork374 (Mark Borkum)
 *
 */
public class SpectraGenImpl implements SpectraGen {
	
	/**
	 * Path to "spectra-gen" executable.
	 */
	private static final String path = "/usr/local/bin/spectra-gen";
	
	/**
	 * Converts a {@link Parameters} instance to a shell command.
	 * 
	 * @param parameters  a {@link Parameters} instance
	 * @return  a shell command
	 */
	private static final String toCommand(final Parameters parameters) {
		final StringBuilder sb = new StringBuilder();
		
		sb.append(path);
		
		sb.append(" --data-points=");
		sb.append(parameters.getDataPoints());
		
		sb.append(" --zero-fills=");
		sb.append(parameters.getZeroFills());
		
		sb.append(" --dwell-time=");
		sb.append(parameters.getDwellTime());
		
		for (final Nucleus nucleus : parameters.getNuclei()) {
			sb.append(" --nucleus=");
			sb.append(nucleus.getInitialAmplitude());
			sb.append(',');
			sb.append(nucleus.getSignalFrequency());
			sb.append(',');
			sb.append(nucleus.getRelaxationTime());
			sb.append(',');
			sb.append(nucleus.getSignalPhase());
		}
		
		for (final Scan scan : parameters.getScans()) {
			sb.append(" --scan=");
			sb.append(scan.getAcquisitions());
			sb.append(',');
			sb.append(scan.getQuadPhaseShiftError());
			sb.append(',');
			sb.append(scan.getImaginaryAmplifierGainImbalance());
			sb.append(',');
			sb.append(scan.getRealChannelDC());
			sb.append(',');
			sb.append(scan.getImaginaryChannelDC());
			sb.append(',');
			sb.append(scan.getNoiseLevel());
			sb.append(',');
			sb.append(scan.getLineBroadeningFactor());
		}
		
		return sb.toString();
	}

	/**
	 * Default constructor.
	 */
	public SpectraGenImpl() {
		super();
	}

	@Override
	public Data call(final Parameters parameters) throws AvroRemoteException, Message {
		final String command = toCommand(parameters);
		
		try {
			final Process process = Runtime.getRuntime().exec(command);
			
			switch (process.exitValue()) {
			case 0:
				final BufferedReader stdin = new BufferedReader(new InputStreamReader(process.getInputStream()));
				
				final List<List<Double>> values = new LinkedList<List<Double>>();
				
				for (String line = null; (line = stdin.readLine()) != null; ) {
					if (!line.isEmpty()) {
						final List<Double> doubles = new LinkedList<Double>();
						
						for (final String string : line.split(",")) {
							doubles.add(Double.parseDouble(string));
						}
						
						values.add(doubles);
					}
				}
				
				return new Data(values);
			default:
				final BufferedReader stderr = new BufferedReader(new InputStreamReader(process.getErrorStream()));
				
				final StringBuilder sb = new StringBuilder();
				
				for (String line = null; (line = stderr.readLine()) != null; ) {
					if (!line.isEmpty()) {
						sb.append(line);
						sb.append(System.getProperty("line.separator"));
					}
				}
				
				throw new Message(sb.toString());
			}
		} catch (final IOException e) {
			throw new AvroRemoteException(e);
		}
	}

}
