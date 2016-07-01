package com.woernerj.dragonsdogma.bo.types.xml;

public class U32 extends CastingType<Integer, Long> {

	@Override
	public Long getValue() {
		return (long)(this.value & 0x00000000FFFFFFFFL); 
	}
	@Override
	public void setValue(Long value) {
		this.value = (int)(value & 0xFFFFFFFFL);
	}
	@Override
	public Long getMinValue() {
		return 0L;
	}
	@Override
	public Long getMaxValue() {
		return 4294967295L;
	}
}