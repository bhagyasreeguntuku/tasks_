package com.logger;
public class SortingEx {
private static Logger log=Logger.getLogger(SortingEx.class);
private static Layout layout=new SimpleLayout();
private  static Appender app=new ConsoleAppender(layout);
private static Layout layout1=new PatternLayout("{%C}-%d{YY-MM-dd hh:mm} -%m %n");
private static Layout layout2=new HTMLLayout();
private static Layout layout3=new XMLLayout();
	public static void main(String[] args) throws IOException {
		int temporary=0,temporary1=0;
		 Appender fapp = new FileAppender(layout1,"logging.txt");
		 Appender happ = new FileAppender(layout2,"sample.html");
		 Appender xapp = new FileAppender(layout3,"sample1.xml");
			log.addAppender(fapp);
			log.addAppender(xapp);
		 log.addAppender(happ);
		log.addAppender(app);
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		ArrayList al=new ArrayList();
		SortingEx e1=new SortingEx();
		for(int index=0;index<number;index++)
		{
			al.add(s.nextInt());
		}
		log.debug("Elements added successfully");
		e1.call(al);
		System.out.println(al);
		e1.display(al);
	
	}
	private  void  display(ArrayList al) {
		// TODO Auto-generated method stub
		Iterator i=al.iterator();
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
		log.debug("Elements are displayed");
	}
	public void  call(ArrayList al)
	{
		Collections.sort(al);
		log.debug("Elements sorted");
		
		
		
	}
}