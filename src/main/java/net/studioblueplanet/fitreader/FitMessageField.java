/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.studioblueplanet.fitreader;

/**
 *
 * @author Jorgen
 */
public class FitMessageField
{
    public FitFieldDefinition           definition;
    public boolean                      isArray;
    public int                          size;
    public int                          baseType;
    public int                          byteArrayPosition;
	@Override
	public String toString() {
		return "FitMessageField [definition=" + definition + ", isArray=" + isArray + ", size=" + size + ", baseType="
				+ baseType + ", byteArrayPosition=" + byteArrayPosition + "]";
	}
    
    
    
}
