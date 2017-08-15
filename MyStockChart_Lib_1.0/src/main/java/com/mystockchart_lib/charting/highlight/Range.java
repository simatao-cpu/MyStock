package com.mystockchart_lib.charting.highlight;

/**
 * Class that represents the range of one value in a stacked bar entry. e.g.
 * stack values are -10, 5, 20 -> then ranges are (-10 - 0, 0 - 5, 5 - 25).
 */
public final class Range {

	public float from;
	public float to;

	public Range(float from, float to) {
		this.from = from;
		this.to = to;
	}

	/**
	 * Returns true if this range contains (if the value is in between) the given value, false if not.
	 * 
	 * @param value
	 * @return
	 */
	public boolean contains(float value) {

		return (value > from && value <= to);
	}

	public boolean isLarger(float value) {
		return value > to;
	}

	public boolean isSmaller(float value) {
		return value < from;
	}
}