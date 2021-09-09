package ch06.maze;

public class Move {

	public int direction = 0; // 이미 가본 방향을 막기위한 설정값

	public int x = 0;
	public int y = 0;

	public Move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Move [" + x + "," + y + "," + direction + "]" ;
	}
	
	
}