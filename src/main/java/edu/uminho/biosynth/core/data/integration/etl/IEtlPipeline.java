package edu.uminho.biosynth.core.data.integration.etl;

import java.io.Serializable;

import pt.uminho.sysbio.biosynth.integration.etl.EtlTransform;

public interface IEtlPipeline<SRC, DST> {
	public void performEtl(Serializable id, 
			IEtlExtract<SRC> extract, EtlTransform<SRC, DST> transform, IEtlLoad<DST> load);
}
