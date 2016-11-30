package com.virtusa.TestListMain;

public class ListMember {
	
	public int  id;
	public String name;
	
	public ListMember(int id, String name) {

		this.id = id;
		this.name = name;

	}
	public void abc(Database database){
		System.out.println(database.membersList.get(0).id +" "+ database.membersList.get(0).name);
	}

}
