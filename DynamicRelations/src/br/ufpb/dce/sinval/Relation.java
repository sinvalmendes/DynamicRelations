package br.ufpb.dce.sinval;

public class Relation {
	
	private RelationType type;
	private Entity source;
	private Entity target;
	
	public Relation(RelationType type, Entity source, Entity target){
		type.addRelation(this);
		this.source = source;
		this.target = target;
	}
}
