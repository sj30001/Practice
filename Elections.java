
public class Elections {	
	public static int visit(String[] likehoods){
		double candidateVoteCount = 0;
	    double totalVotes = 0;
	    int returnIndex = 0;
	    double bigNumberToStart = 999999999;
		double[] resultReadyToExam = new double[likehoods.length];
	       
	        
	        for(int i = 0; i < likehoods.length; i++){
	            totalVotes = likehoods[i].length();
	            for(int j = 0; j < likehoods[i].length(); j++){
	                if(likehoods[i].charAt(j) == '1'){
	                    candidateVoteCount++;
	                }
	            }
	            resultReadyToExam[i] = candidateVoteCount / totalVotes;
	            candidateVoteCount = 0;
	        }
	        
	        for(int k = 0; k < resultReadyToExam.length; k++){
	            if(resultReadyToExam[k] < bigNumberToStart){
	                bigNumberToStart = resultReadyToExam[k];
	                returnIndex = k;
	            }
	        }
	        return returnIndex;
	            
	    }
}
