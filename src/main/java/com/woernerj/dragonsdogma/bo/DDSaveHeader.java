package com.woernerj.dragonsdogma.bo;

import java.nio.ByteOrder;

public class DDSaveHeader {

	private Integer version;
	private Integer size;
	private Integer compressedSize;
	private Integer checksum;

	public static final Integer HEADER_BYTES = 32;
	public static final ByteOrder ENDIANNESS = ByteOrder.LITTLE_ENDIAN;

	public DDSaveHeader() {
		this.version = 0;
		this.size = 0;
		this.compressedSize = 0;
		this.checksum = 0;
	}

	public DDSaveHeader(final Integer version, final Integer size,
			final Integer compressedSize, final Integer checksum) {
		this.version = version;
		this.size = size;
		this.compressedSize = compressedSize;
		this.checksum = checksum;
	}

	public Integer getVersion() {
		return this.version;
	}
	
	public DDVersion getDDVersion() {
		return DDVersion.parse(this.version);
	}

	public Integer getSize() {
		return this.size;
	}

	public Integer getCompressedSize() {
		return this.compressedSize;
	}

	public Integer getChecksum() {
		return this.checksum;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public void setCompressedSize(Integer compressedSize) {
		this.compressedSize = compressedSize;
	}

	public void setChecksum(Integer checksum) {
		this.checksum = checksum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof DDSaveHeader)) return false;
		
		DDSaveHeader other = (DDSaveHeader)obj;
		return other.hashCode() == this.hashCode();
	}
	
	@Override
	public int hashCode() {
		if (this.checksum == null) {
			return -1;
		}
		return this.checksum;
	}
}