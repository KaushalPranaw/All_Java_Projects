
public class ShutdownHook {

	public static void main(String[] args) 
	{
		Runtime.getRuntime().addShutdownHook(new Thread(){
			public void run()
			{
				System.out.println("system is shutting");
			}
		});
		System.out.println("appn terminating");
	}
}
