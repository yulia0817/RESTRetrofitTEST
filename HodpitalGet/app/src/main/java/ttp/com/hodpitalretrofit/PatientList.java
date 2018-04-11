package ttp.com.hodpitalretrofit;

/**
 * Created by 0047TiTANplateform_ on 2018-04-10.
 */

public class PatientList {

    private String PATIENT_CODE;
    private String HOSPITAL;
    private String NAME;
    private String GENDER;
    private String BIRTH;
    private String BREAKFAST;
    private String LUNCH;
    private String DINNER;
    private String EXERCISE_TYPE;
    private String EXERCISE_TIME;
    private String SLEEP;
    private String WAKEUP;
    private String GROUPS;
    private String MEMO;
    private int TEST_COUNT;


    public String getPATIENT_CODE() {
        return PATIENT_CODE;
    }

    public void setPATIENT_CODE(String PATIENT_CODE) {
        this.PATIENT_CODE = PATIENT_CODE;
    }

    public String getHOSPITAL() {
        return HOSPITAL;
    }

    public void setHOSPITAL(String HOSPITAL) {
        this.HOSPITAL = HOSPITAL;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public String getBIRTH() {
        return BIRTH;
    }

    public void setBIRTH(String BIRTH) {
        this.BIRTH = BIRTH;
    }

    public String getBREAKFAST() {
        return BREAKFAST;
    }

    public void setBREAKFAST(String BREAKFAST) {
        this.BREAKFAST = BREAKFAST;
    }

    public String getLUNCH() {
        return LUNCH;
    }

    public void setLUNCH(String LUNCH) {
        this.LUNCH = LUNCH;
    }

    public String getDINNER() {
        return DINNER;
    }

    public void setDINNER(String DINNER) {
        this.DINNER = DINNER;
    }

    public String getEXERCISE_TYPE() {
        return EXERCISE_TYPE;
    }

    public void setEXERCISE_TYPE(String EXERCISE_TYPE) {
        this.EXERCISE_TYPE = EXERCISE_TYPE;
    }

    public String getEXERCISE_TIME() {
        return EXERCISE_TIME;
    }

    public void setEXERCISE_TIME(String EXERCISE_TIME) {
        this.EXERCISE_TIME = EXERCISE_TIME;
    }

    public String getSLEEP() {
        return SLEEP;
    }
g
    public void setSLEEP(String SLEEP) {
        this.SLEEP = SLEEP;
    }

    public String getWAKEUP() {
        return WAKEUP;
    }

    public void setWAKEUP(String WAKEUP) {
        this.WAKEUP = WAKEUP;
    }

    public String getGROUPS() {
        return GROUPS;
    }

    public void setGROUPS(String GROUPS) {
        this.GROUPS = GROUPS;
    }

    public String getMEMO() {
        return MEMO;
    }

    public void setMEMO(String MEMO) {
        this.MEMO = MEMO;
    }

    public int getTEST_COUNT() {
        return TEST_COUNT;
    }

    public void setTEST_COUNT(int TEST_COUNT) {
        this.TEST_COUNT = TEST_COUNT;
    }

    @Override
    public String toString() {
        return "PatientList{" +
                "PATIENT_CODE='" + PATIENT_CODE + '\'' +
                ", HOSPITAL='" + HOSPITAL + '\'' +
                ", NAME='" + NAME + '\'' +
                ", GENDER='" + GENDER + '\'' +
                ", BIRTH='" + BIRTH + '\'' +
                ", BREAKFAST='" + BREAKFAST + '\'' +
                ", LUNCH='" + LUNCH + '\'' +
                ", DINNER='" + DINNER + '\'' +
                ", EXERCISE_TYPE='" + EXERCISE_TYPE + '\'' +
                ", EXERCISE_TIME='" + EXERCISE_TIME + '\'' +
                ", SLEEP='" + SLEEP + '\'' +
                ", WAKEUP='" + WAKEUP + '\'' +
                ", GROUPS='" + GROUPS + '\'' +
                ", MEMO='" + MEMO + '\'' +
                ", TEST_COUNT=" + TEST_COUNT +
                '}';
    }
}
