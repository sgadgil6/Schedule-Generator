/**
 * Created by David on 1/23/16.
 */
public class Course {
    private String name;
    private String date;
    private String time;
    private String professor;
    private boolean available;
    private int number;

    public Course(String name, String date, String time, String professor, boolean available, int number) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.professor = professor;
        this.available = true;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String[] getDates() {
        String [] dates = new String[date.length()];
        for (int i = 0; i < date.length(); i++) {
            dates[i] = date.substring(i,i + 1);
        }
        return dates;
    }

    public String getTime() {
        return time;
    }

    public String getProfessor() {
        return professor;
    }

    public boolean getAvailable() {
        return available;
    }

    public int getNumber() {
        return number;
    }

    public boolean checkAvailability(Course other) {
        if (!this.available || !other.available) {
            return false;
        }
        if (other == null) {
            return false;
        }
        if (other.getName().equals(this.getName())) {
            return false;
        }
        for (int i = 0; i < other.getDates().length; i++) {
            for (int j = 0; j < this.getDates().length; j++) {
                if (other.getDates()[i].equals(this.getDates()[j])) {
                    if (other.getTime().equals(this.getTime())) {
                        return false;
                    }
//                    String othertimestart = other.getTime().substring(0, other.getTime().indexOf("-"));
//                    String othertimeend = other.getTime().substring(other.getTime().indexOf("-") + 1);
//                    String thistimestart = this.getTime().substring(0, other.getTime().indexOf("-"));
//                    String thistimeend = this.getTime().substring(other.getTime().indexOf("-") + 1);
////                    if (Integer.parseInt(other.getTime().substring(0, other.getTime().indexOf(":")))) {
////
////                    }
                }
            }
        }
        return true;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return name + "/" + date + "/" + time + "/" + professor + "/" + number;
    }

    @Override
    public boolean equals(Object other) {
        Course that = (Course) other;
        return this.getNumber() == that.getNumber();
    }

    @Override
    public int hashCode() {
        return number;
    }
}
