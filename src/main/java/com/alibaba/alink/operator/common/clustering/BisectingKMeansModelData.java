package com.alibaba.alink.operator.common.clustering;

import com.alibaba.alink.common.linalg.DenseVector;

import java.io.Serializable;
import java.util.Map;

public class BisectingKMeansModelData {
    public int k;
    public int vectorSize;
    public DistanceType distanceType;
    public String vectorColName;

    public Map<Long, ClusterSummary> summaries;

    public static class ClusterSummary implements Serializable {
        public long clusterId;
        public long size; // the number of points within this cluster
        public DenseVector center; // the center of the points within this cluster
        public double cost; // the sum of squared distances to the center

        @Override
        public String toString() {
            return String.format("size=%d,cost=%f,center=%s", size, cost, center.toString());
        }
    }
}
