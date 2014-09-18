package org.xtext.passi;

/**
 * Class containing the metamodels keywords. For example, consider this model tag:
 * 
 * <pre>
 * {@code
 * <drd:Actor ActorCommunication="/5" ActorName="Actor_0"/>
 * }
 * </pre>
 * 
 * The reference EClass is <i>Actor</i>, in the <i>DRD</i> metamodel. The key attribute choosen in this case
 * is <b>ActorName</b>. So, when the previous tag is referenced by another tag in the persistence model, the 
 * value of the attribute <b>ActorName</b>
 *  that one from the attribute ActorName.
 * 
 * @author Davide Guastella(davide.guastella90@gmail.com)
 */
public class MetamodelKeyAttributes 
{
	private static final String NAME 					= "name";
	private static final String ACTORNAME 				= "ActorName";
	private static final String USECASENAME 			= "UseCaseName";
	private static final String COMMUNICATIONFUNCTREQ 	= "CommunicationFunctReq";
	private static final String AGENTNAME 				= "AgentName";
	
	public static boolean isKeyAttribute(String kw)
	{		
		return kw.equals(NAME) 						|| 
			   kw.equals(ACTORNAME) 				||
			   kw.equals(USECASENAME) 				||
			   kw.equals(COMMUNICATIONFUNCTREQ)		||
			   kw.equals(AGENTNAME);
	}
}
