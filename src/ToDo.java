public class ToDo implements Comparable<ToDo> {
    private final Importance IMPORTANCE; //ENUM
    private final Integer PRIORITY;
    private final String DESCRIPTION;

    public ToDo(Importance importance, Integer priority, String description) {
        IMPORTANCE = importance;
        PRIORITY = priority;
        DESCRIPTION = description;
    }

    @Override
    public String toString() {
        return "IMPORTANCE : " + IMPORTANCE +
                " || PRIORITY : " + PRIORITY +
                " || DESCRIPTION : " + DESCRIPTION ;
    }

    @Override
    public int compareTo(ToDo o) {
        if(this.IMPORTANCE.equals(o.IMPORTANCE)){
            return this.PRIORITY - o.PRIORITY;
        }
        return this.IMPORTANCE.compareTo(o.IMPORTANCE);
    }
}