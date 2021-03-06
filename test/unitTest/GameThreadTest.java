package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import form.GameForm;
import tetris.GameArea;
import tetris.GameThread;
import tetris.NextBlockArea;

class GameThreadTest {
	private GameArea ga;
	private NextBlockArea nba;
	
	final GameForm gf = new GameForm(600, 450);
	final GameThread gt = new GameThread(gf, ga, nba);

	@Test
	void testRun() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGameThread() {
		fail("Not yet implemented");
	}

	@Test
	void testPause() {
		gt.pause();
		assertTrue(gt.getIsPaused());
	}

	@Test
	void testReStart() {
		gt.reStart();
		assertFalse(gt.getIsPaused());
	}

	@Test
	void testGetIsPaused() {
		assertNotNull(gt.getIsPaused());
	}

}
