package Board;

public class BoardDelete extends BoardHM {
	private int choice;

	public BoardDelete(int choice) {
		this.choice = choice;
		delete();
	}

	private void delete() {
		map.remove(choice);
		caseEmpty();
	}
	
	private void caseEmpty() {
		if (map.keySet().isEmpty()) {
			System.out.println("게시글이 없습니다");
		}else if (map.get(choice) == null || number > map.size()) {
			System.out.println("존재하지 않는 게시물입니다.");
		}
		
	}
}
