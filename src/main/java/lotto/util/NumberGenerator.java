package lotto.util;

import java.util.List;

@FunctionalInterface
public interface NumberGenerator {
	List<Integer> generate();
}
