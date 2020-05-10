package com.manish.soni;

public class App {

	public static void main(String[] args) {

		Algorithm algorithm = AlgorithmFactory.createAlgorithm(AlgorithmFactory.SORTEST_PATH);

		algorithm.solve();
	}
}
