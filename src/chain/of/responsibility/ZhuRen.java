package chain.of.responsibility;

//主任
public class ZhuRen extends Leader{

  public ZhuRen(String name){
      super(name);
  }
  
  
  public void handleRequest(QingjiaRequest qingjiaRequest) {
      if(qingjiaRequest.getDays()<3){
    	  System.out.println("员工请假天数为："+qingjiaRequest.getDays());
          System.out.println("所以员工请假小于3天");
          System.out.println("审批通过");
      }else{
          if(this.nextLeader!=null){
              this.nextLeader.handleRequest(qingjiaRequest);
          }
      }
           
  }

}
