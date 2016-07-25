/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package gov.pnnl.emsl.magres.spectra_gen;  
@SuppressWarnings("all")
/** A resonant nucleus. */
@org.apache.avro.specific.AvroGenerated
public class Nucleus extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Nucleus\",\"namespace\":\"gov.pnnl.emsl.magres.spectra_gen\",\"doc\":\"A resonant nucleus.\",\"fields\":[{\"name\":\"initialAmplitude\",\"type\":\"double\",\"doc\":\"The initial amplitude of the nucleus (dimensionless).\"},{\"name\":\"signalFrequency\",\"type\":\"double\",\"doc\":\"The resonant frequency of the nucleus (Hertz).\"},{\"name\":\"relaxationTime\",\"type\":\"double\",\"doc\":\"The relaxation time constant of the nucleus (seconds).\"},{\"name\":\"signalPhase\",\"type\":\"double\",\"doc\":\"The phase of the nucleus (radians).\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The initial amplitude of the nucleus (dimensionless). */
  @Deprecated public double initialAmplitude;
  /** The resonant frequency of the nucleus (Hertz). */
  @Deprecated public double signalFrequency;
  /** The relaxation time constant of the nucleus (seconds). */
  @Deprecated public double relaxationTime;
  /** The phase of the nucleus (radians). */
  @Deprecated public double signalPhase;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Nucleus() {}

  /**
   * All-args constructor.
   */
  public Nucleus(java.lang.Double initialAmplitude, java.lang.Double signalFrequency, java.lang.Double relaxationTime, java.lang.Double signalPhase) {
    this.initialAmplitude = initialAmplitude;
    this.signalFrequency = signalFrequency;
    this.relaxationTime = relaxationTime;
    this.signalPhase = signalPhase;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return initialAmplitude;
    case 1: return signalFrequency;
    case 2: return relaxationTime;
    case 3: return signalPhase;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: initialAmplitude = (java.lang.Double)value$; break;
    case 1: signalFrequency = (java.lang.Double)value$; break;
    case 2: relaxationTime = (java.lang.Double)value$; break;
    case 3: signalPhase = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'initialAmplitude' field.
   * The initial amplitude of the nucleus (dimensionless).   */
  public java.lang.Double getInitialAmplitude() {
    return initialAmplitude;
  }

  /**
   * Sets the value of the 'initialAmplitude' field.
   * The initial amplitude of the nucleus (dimensionless).   * @param value the value to set.
   */
  public void setInitialAmplitude(java.lang.Double value) {
    this.initialAmplitude = value;
  }

  /**
   * Gets the value of the 'signalFrequency' field.
   * The resonant frequency of the nucleus (Hertz).   */
  public java.lang.Double getSignalFrequency() {
    return signalFrequency;
  }

  /**
   * Sets the value of the 'signalFrequency' field.
   * The resonant frequency of the nucleus (Hertz).   * @param value the value to set.
   */
  public void setSignalFrequency(java.lang.Double value) {
    this.signalFrequency = value;
  }

  /**
   * Gets the value of the 'relaxationTime' field.
   * The relaxation time constant of the nucleus (seconds).   */
  public java.lang.Double getRelaxationTime() {
    return relaxationTime;
  }

  /**
   * Sets the value of the 'relaxationTime' field.
   * The relaxation time constant of the nucleus (seconds).   * @param value the value to set.
   */
  public void setRelaxationTime(java.lang.Double value) {
    this.relaxationTime = value;
  }

  /**
   * Gets the value of the 'signalPhase' field.
   * The phase of the nucleus (radians).   */
  public java.lang.Double getSignalPhase() {
    return signalPhase;
  }

  /**
   * Sets the value of the 'signalPhase' field.
   * The phase of the nucleus (radians).   * @param value the value to set.
   */
  public void setSignalPhase(java.lang.Double value) {
    this.signalPhase = value;
  }

  /** Creates a new Nucleus RecordBuilder */
  public static gov.pnnl.emsl.magres.spectra_gen.Nucleus.Builder newBuilder() {
    return new gov.pnnl.emsl.magres.spectra_gen.Nucleus.Builder();
  }
  
  /** Creates a new Nucleus RecordBuilder by copying an existing Builder */
  public static gov.pnnl.emsl.magres.spectra_gen.Nucleus.Builder newBuilder(gov.pnnl.emsl.magres.spectra_gen.Nucleus.Builder other) {
    return new gov.pnnl.emsl.magres.spectra_gen.Nucleus.Builder(other);
  }
  
  /** Creates a new Nucleus RecordBuilder by copying an existing Nucleus instance */
  public static gov.pnnl.emsl.magres.spectra_gen.Nucleus.Builder newBuilder(gov.pnnl.emsl.magres.spectra_gen.Nucleus other) {
    return new gov.pnnl.emsl.magres.spectra_gen.Nucleus.Builder(other);
  }
  
  /**
   * RecordBuilder for Nucleus instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Nucleus>
    implements org.apache.avro.data.RecordBuilder<Nucleus> {

    private double initialAmplitude;
    private double signalFrequency;
    private double relaxationTime;
    private double signalPhase;

    /** Creates a new Builder */
    private Builder() {
      super(gov.pnnl.emsl.magres.spectra_gen.Nucleus.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(gov.pnnl.emsl.magres.spectra_gen.Nucleus.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.initialAmplitude)) {
        this.initialAmplitude = data().deepCopy(fields()[0].schema(), other.initialAmplitude);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.signalFrequency)) {
        this.signalFrequency = data().deepCopy(fields()[1].schema(), other.signalFrequency);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.relaxationTime)) {
        this.relaxationTime = data().deepCopy(fields()[2].schema(), other.relaxationTime);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.signalPhase)) {
        this.signalPhase = data().deepCopy(fields()[3].schema(), other.signalPhase);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Nucleus instance */
    private Builder(gov.pnnl.emsl.magres.spectra_gen.Nucleus other) {
            super(gov.pnnl.emsl.magres.spectra_gen.Nucleus.SCHEMA$);
      if (isValidValue(fields()[0], other.initialAmplitude)) {
        this.initialAmplitude = data().deepCopy(fields()[0].schema(), other.initialAmplitude);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.signalFrequency)) {
        this.signalFrequency = data().deepCopy(fields()[1].schema(), other.signalFrequency);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.relaxationTime)) {
        this.relaxationTime = data().deepCopy(fields()[2].schema(), other.relaxationTime);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.signalPhase)) {
        this.signalPhase = data().deepCopy(fields()[3].schema(), other.signalPhase);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'initialAmplitude' field */
    public java.lang.Double getInitialAmplitude() {
      return initialAmplitude;
    }
    
    /** Sets the value of the 'initialAmplitude' field */
    public gov.pnnl.emsl.magres.spectra_gen.Nucleus.Builder setInitialAmplitude(double value) {
      validate(fields()[0], value);
      this.initialAmplitude = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'initialAmplitude' field has been set */
    public boolean hasInitialAmplitude() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'initialAmplitude' field */
    public gov.pnnl.emsl.magres.spectra_gen.Nucleus.Builder clearInitialAmplitude() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'signalFrequency' field */
    public java.lang.Double getSignalFrequency() {
      return signalFrequency;
    }
    
    /** Sets the value of the 'signalFrequency' field */
    public gov.pnnl.emsl.magres.spectra_gen.Nucleus.Builder setSignalFrequency(double value) {
      validate(fields()[1], value);
      this.signalFrequency = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'signalFrequency' field has been set */
    public boolean hasSignalFrequency() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'signalFrequency' field */
    public gov.pnnl.emsl.magres.spectra_gen.Nucleus.Builder clearSignalFrequency() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'relaxationTime' field */
    public java.lang.Double getRelaxationTime() {
      return relaxationTime;
    }
    
    /** Sets the value of the 'relaxationTime' field */
    public gov.pnnl.emsl.magres.spectra_gen.Nucleus.Builder setRelaxationTime(double value) {
      validate(fields()[2], value);
      this.relaxationTime = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'relaxationTime' field has been set */
    public boolean hasRelaxationTime() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'relaxationTime' field */
    public gov.pnnl.emsl.magres.spectra_gen.Nucleus.Builder clearRelaxationTime() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'signalPhase' field */
    public java.lang.Double getSignalPhase() {
      return signalPhase;
    }
    
    /** Sets the value of the 'signalPhase' field */
    public gov.pnnl.emsl.magres.spectra_gen.Nucleus.Builder setSignalPhase(double value) {
      validate(fields()[3], value);
      this.signalPhase = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'signalPhase' field has been set */
    public boolean hasSignalPhase() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'signalPhase' field */
    public gov.pnnl.emsl.magres.spectra_gen.Nucleus.Builder clearSignalPhase() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Nucleus build() {
      try {
        Nucleus record = new Nucleus();
        record.initialAmplitude = fieldSetFlags()[0] ? this.initialAmplitude : (java.lang.Double) defaultValue(fields()[0]);
        record.signalFrequency = fieldSetFlags()[1] ? this.signalFrequency : (java.lang.Double) defaultValue(fields()[1]);
        record.relaxationTime = fieldSetFlags()[2] ? this.relaxationTime : (java.lang.Double) defaultValue(fields()[2]);
        record.signalPhase = fieldSetFlags()[3] ? this.signalPhase : (java.lang.Double) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
