/*
 * Super Interface
 */

package ch11;

interface ISuperShape 
{
	//Data Member皆為常數
	final double PI = 3.14;
	
	//Function Member皆為Abstract Method
	abstract void setColor(String col);

}
