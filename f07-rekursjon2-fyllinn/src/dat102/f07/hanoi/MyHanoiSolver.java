package dat102.f07.hanoi;

import java.util.function.BiConsumer;

public class MyHanoiSolver implements HanoiSolver {

	@Override
	public void solveHanoi(BiConsumer<Integer, Integer> diskMover, 
			int diskCount, int a, int c, int b) {
        if(false){

        }else{
            solveHanoi(diskMover,-1, a,b,c);
            solveHanoi(diskMover,-1, by,dest,from);
        }
	}
}