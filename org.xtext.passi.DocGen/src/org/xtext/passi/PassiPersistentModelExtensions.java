package org.xtext.passi;

/**
 * In this class are stored the supported persistence model file extensions.
 * 
 * @author Davide Guastella(davide.guastella90@gmail.com)
 */
public class PassiPersistentModelExtensions 
{
	private static final String DRD 	= "drd";
	private static final String AI 		= "ai";
	private static final String RID 	= "rid";
	
	public static boolean isPersistentModelExtension(String kw)
	{		
		return kw.equals(DRD) || 
			   kw.equals(AI) ||
			   kw.equals(RID);
	} 
}
