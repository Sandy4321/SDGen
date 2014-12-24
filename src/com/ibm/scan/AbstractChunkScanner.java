/*
 * Copyright (C) 2014 Raul Gracia-Tinedo
 * 
 * This program is free software: you can redistribute it and/or modify it under 
 * the terms of the GNU General Public License as published by the Free Software 
 * Foundation, either version 3 of the License, or (at your option) any later 
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS 
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with 
 * this program. If not, see http://www.gnu.org/licenses/.
 */
package com.ibm.scan;

import java.util.concurrent.RecursiveAction;

import com.ibm.characterization.Histogram;

/**
 * This class should be extended by those classes that scan the
 * contents of data.
 * 
 * @author Raul Gracia-Tinedo (raulgraciatinedo@gmail.com)
 *
 */
public abstract class AbstractChunkScanner extends RecursiveAction implements ChunkInfoSetter{

	private static final long serialVersionUID = 1L;

	public static final String scannerPackagePath = "com.ibm.scan.";
	
	protected Histogram histogram;
	
	protected byte[] toScan;
		
	public abstract void scan (byte [] data);
	
	public abstract Histogram getHistogram();
	
	protected void setToScan(byte[] toScan) {
		this.toScan = toScan;
	}
}