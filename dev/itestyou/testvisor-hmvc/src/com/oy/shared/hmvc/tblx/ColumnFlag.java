/*
	Hierarchical Model View Controller (OY-HMVC)
	Copyright (C) 2005-2008 Pavel Simakov
	http://www.softwaresecretweapons.com

	This library is free software; you can redistribute it and/or
	modify it under the terms of the GNU Lesser General Public
	License as published by the Free Software Foundation; either
	version 2.1 of the License, or (at your option) any later version.

	This library is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
	Lesser General Public License for more details.

	You should have received a copy of the GNU Lesser General Public
	License along with this library; if not, write to the Free Software
	Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA
*/


package com.oy.shared.hmvc.tblx;

public class ColumnFlag {

	private boolean enabled = false;
	private boolean flag = true;
	private int colIdx;
	
	public boolean getEnabled(){
		return enabled;
	}
	 
	public void setEnabled(boolean value){
		enabled = value;
	}
	
	public boolean getFlag(){
		return flag;
	}
	
	public void setFlag(boolean value){
		flag = value;
	}
	
	public int getColIdx(){
		return colIdx;
	}
	 
	public void setColIdx(int value){
		colIdx = value;
	} 
}
