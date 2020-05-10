package com.manish.soni;

public class AlgorithmFactory {

	public final static int SORTEST_PATH = 0;

	public final static int SPANNING_TREE = 1;

	public static Algorithm createAlgorithm(int type) {

		switch (type) {
		case SORTEST_PATH:
			return new SortestPath();
		case SPANNING_TREE:
			return new SpanningTree();
		default:
			return null;
		}
	}

}
