package alorithm.domain;

public class Node {
	String data;
	Node left;
	Node right;
	Node(String data){
		this.data=data;
	}
	
	Node newNode(String data) {
		return new Node(data);
	}
	
	// 첫번쨰 노드는 있다고가정함.
	void addNode(String data) {
		if(left==null) {
			left=newNode(data);
		}
	}
}
