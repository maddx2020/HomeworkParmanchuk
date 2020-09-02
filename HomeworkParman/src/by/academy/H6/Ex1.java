package by.academy.H6;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex1 {

	public static void main(String[] args) {

		Map<Long, String> newMap = Stream.generate(() -> new Random().nextInt(100)).
				distinct().limit(100).
				map(m -> (long) (m * Math.PI - 20)).
				filter(f -> f < 100).skip(3).
				collect(Collectors.toMap(c -> c, c -> "Number: " + c));

		newMap.keySet().stream().sorted().forEach(fe -> System.out.println(fe + " - " + newMap.get(fe)));

	}

}