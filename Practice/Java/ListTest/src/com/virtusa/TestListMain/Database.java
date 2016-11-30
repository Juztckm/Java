package com.virtusa.TestListMain;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	public List<ListMember> membersList = new ArrayList<ListMember>();
	
	
	Database(){
		membersList.add(new ListMember(101, "Jack"));
		membersList.add(new ListMember(102, "John"));
		membersList.add(new ListMember(103, "Jil"));
		membersList.add(new ListMember(104, "Eddi"));
		membersList.add(new ListMember(105, "Gorge"));
	}

}
