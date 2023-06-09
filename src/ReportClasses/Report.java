package ReportClasses;

public abstract class Report {

    protected final int id;
    protected float sum;
    protected String categoryIndex;
    protected String date;

    Report(int id){this.id = id;}

    public int getId() {
        return id;
    }

    public float getSum() {
        return sum;
    }

    public String getCategoryIndex() {
        return categoryIndex;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
