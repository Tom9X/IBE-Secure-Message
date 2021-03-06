package hamaster.gradesign.client;

import hamaster.gradesign.ibe.util.Hex;

public class HexEncoder implements Encoder {

	public HexEncoder() {
	}

	/*
	 * (non-Javadoc)
	 * @see hamaster.gradesign.client.Encoder#encode(byte[])
	 */
	@Override
	public String encode(byte[] data) {
		return Hex.hex(data);
	}

	/*
	 * (non-Javadoc)
	 * @see hamaster.gradesign.client.Encoder#decode(java.lang.String)
	 */
	@Override
	public byte[] decode(String code) {
		return Hex.unhex(code);
	}

	/*
	 * (non-Javadoc)
	 * @see hamaster.gradesign.client.Encoder#name()
	 */
	@Override
	public String name() {
		return "Hex";
	}
}
