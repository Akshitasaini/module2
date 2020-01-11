package thread;
public class MaxPriorityTest {
	public static void main (String [] args) {
		ThreadGroup groupNORM = new ThreadGroup("a group with normal priority");
		ThreadGroup priorityMAX = new ThreadGroup(groupNORM,"a THREAD with maximum priority");
		ThreadGroup priorityMIN= new ThreadGroup(groupNORM,"a THREAD with MINIMUM priority");

		priorityMAX.setMaxPriority(Thread.MAX_PRIORITY);
		groupNORM.setMaxPriority(Thread.NORM_PRIORITY);
		priorityMIN.setMaxPriority(Thread.MIN_PRIORITY);
		
		System.out.format("group's maximum priority =%d%n", groupNORM.getMaxPriority());
		System.out.format("THREADS priority =%d%n", priorityMAX.getMaxPriority());
		System.out.format("group's MINIMUM priority =%d%n", priorityMIN.getMaxPriority());


		
	}
	
}
