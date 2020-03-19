package package3_18;

public class Interview {
    private String candidateName;
    private double candidateScore;
    private String finalDecision;
    private int javaPoint;
    private int SQLPoint;
    private int softSkillPoint;

    public Interview(String candidateName, int javaPoint, int SQLPoint, int softSkillPoint){
        this.candidateName = candidateName;
//        this.candidateScore = candidateScore;
//        this.finalDecision = finalDecision;
        this.javaPoint = javaPoint;
        this.SQLPoint = SQLPoint;
        this.softSkillPoint = softSkillPoint;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public double getCandidateScore() {
        return candidateScore;
    }

    public void setCandidateScore(double candidateScore) {
        this.candidateScore = candidateScore;
    }

    public String getFinalDecision() {
        return finalDecision;
    }

    public void setFinalDecision(String finalDecision) {
        this.finalDecision = finalDecision;
    }

    public int getJavaPoint() {
        return javaPoint;
    }

    public void setJavaPoint(int javaPoint) {
        this.javaPoint = javaPoint;
    }

    public int getSQLPoint() {
        return SQLPoint;
    }

    public void setSQLPoint(int SQLPoint) {
        this.SQLPoint = SQLPoint;
    }

    public int getSoftSkillPoint() {
        return softSkillPoint;
    }

    public void setSoftSkillPoint(int softSkillPoint) {
        this.softSkillPoint = softSkillPoint;
    }

    public double calculateScore(){
        this.candidateScore = this.javaPoint + this.SQLPoint + this.softSkillPoint;
        return this.candidateScore;
    }

    public String decideResult(){
        if (this.candidateScore > 100){
            this.finalDecision = "Congrats";
        }else{
            this.finalDecision = "Please try again next time";
        }
        return this.finalDecision;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "candidateName='" + candidateName + '\'' +
                ", candidateScore=" + candidateScore +
                ", finalDecision='" + finalDecision + '\'' +
                ", javaPoint=" + javaPoint +
                ", SQLPoint=" + SQLPoint +
                ", softSkillPoint=" + softSkillPoint +
                '}';
    }
}
