
public class Sub implements Chain{

	Chain next;
	
	@Override
	public void setNext(Chain next) {
		this.next = next;
		
	}

	@Override
	public void handle(Numbers request) {
		
		if(request.getOperation() == "Sub") {		
			 System.out.println(request.getNum1() + " - " + request.getNum2() + " = "+
					 (request.getNum1()-request.getNum2()) );  
		}
		else {
			this.next.handle(request);
		}
		
	}

}
