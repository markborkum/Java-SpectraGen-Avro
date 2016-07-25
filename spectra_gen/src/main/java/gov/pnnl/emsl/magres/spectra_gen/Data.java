/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package gov.pnnl.emsl.magres.spectra_gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Data extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Data\",\"namespace\":\"gov.pnnl.emsl.magres.spectra_gen\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"array\",\"items\":\"double\"}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<java.util.List<java.lang.Double>> values;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Data() {}

  /**
   * All-args constructor.
   */
  public Data(java.util.List<java.util.List<java.lang.Double>> values) {
    this.values = values;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return values;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: values = (java.util.List<java.util.List<java.lang.Double>>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'values' field.
   */
  public java.util.List<java.util.List<java.lang.Double>> getValues() {
    return values;
  }

  /**
   * Sets the value of the 'values' field.
   * @param value the value to set.
   */
  public void setValues(java.util.List<java.util.List<java.lang.Double>> value) {
    this.values = value;
  }

  /** Creates a new Data RecordBuilder */
  public static gov.pnnl.emsl.magres.spectra_gen.Data.Builder newBuilder() {
    return new gov.pnnl.emsl.magres.spectra_gen.Data.Builder();
  }
  
  /** Creates a new Data RecordBuilder by copying an existing Builder */
  public static gov.pnnl.emsl.magres.spectra_gen.Data.Builder newBuilder(gov.pnnl.emsl.magres.spectra_gen.Data.Builder other) {
    return new gov.pnnl.emsl.magres.spectra_gen.Data.Builder(other);
  }
  
  /** Creates a new Data RecordBuilder by copying an existing Data instance */
  public static gov.pnnl.emsl.magres.spectra_gen.Data.Builder newBuilder(gov.pnnl.emsl.magres.spectra_gen.Data other) {
    return new gov.pnnl.emsl.magres.spectra_gen.Data.Builder(other);
  }
  
  /**
   * RecordBuilder for Data instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Data>
    implements org.apache.avro.data.RecordBuilder<Data> {

    private java.util.List<java.util.List<java.lang.Double>> values;

    /** Creates a new Builder */
    private Builder() {
      super(gov.pnnl.emsl.magres.spectra_gen.Data.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(gov.pnnl.emsl.magres.spectra_gen.Data.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.values)) {
        this.values = data().deepCopy(fields()[0].schema(), other.values);
        fieldSetFlags()[0] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Data instance */
    private Builder(gov.pnnl.emsl.magres.spectra_gen.Data other) {
            super(gov.pnnl.emsl.magres.spectra_gen.Data.SCHEMA$);
      if (isValidValue(fields()[0], other.values)) {
        this.values = data().deepCopy(fields()[0].schema(), other.values);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'values' field */
    public java.util.List<java.util.List<java.lang.Double>> getValues() {
      return values;
    }
    
    /** Sets the value of the 'values' field */
    public gov.pnnl.emsl.magres.spectra_gen.Data.Builder setValues(java.util.List<java.util.List<java.lang.Double>> value) {
      validate(fields()[0], value);
      this.values = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'values' field has been set */
    public boolean hasValues() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'values' field */
    public gov.pnnl.emsl.magres.spectra_gen.Data.Builder clearValues() {
      values = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public Data build() {
      try {
        Data record = new Data();
        record.values = fieldSetFlags()[0] ? this.values : (java.util.List<java.util.List<java.lang.Double>>) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
