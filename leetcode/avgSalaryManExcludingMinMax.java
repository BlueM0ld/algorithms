package leetCode;

public class AvgSalaryManExcludingMinMax {
    public double average(int[] salary) {
        
        int localMin = salary[0];
        int localMax = salary[0];
        
        double total = salary[0];
        
        for(int i =1; i<salary.length;i++){
            
            if(salary[i]<localMin){localMin = salary[i];}
            if(salary[i]>localMax){localMax = salary[i];}
            
            total = total + salary[i];
        }
        double cal = ( total - (localMax+localMin) ) / (salary.length-2);
        
        return cal;
        
    }
}
