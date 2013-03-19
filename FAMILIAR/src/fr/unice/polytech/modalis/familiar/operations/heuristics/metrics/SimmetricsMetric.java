package fr.unice.polytech.modalis.familiar.operations.heuristics.metrics;

import uk.ac.shef.wit.simmetrics.similaritymetrics.AbstractStringMetric;
import uk.ac.shef.wit.simmetrics.similaritymetrics.SmithWaterman;

public class SimmetricsMetric implements FeatureSimilarityMetric {

	private AbstractStringMetric metric;
	
	
	public SimmetricsMetric(AbstractStringMetric metric) {
		this.metric = metric;
	}
	
	public SimmetricsMetric(MetricName metricName) {
		setMetric(metricName);
	}

	@Override
	public double similarity(String featureName1, String featureName2) {
		return metric.getSimilarity(featureName1, featureName2);
	}
	
	
	public AbstractStringMetric getMetric() {
		return metric;
	}
	
	public void setMetric(AbstractStringMetric metric) {
		this.metric = metric;
	}
	
	public void setMetric(MetricName metricName) {
		switch (metricName) {
		case SMITHWATERMAN:
			metric = new SmithWaterman();
			break;
		}
	}

	public enum MetricName {
		SMITHWATERMAN
	}
}