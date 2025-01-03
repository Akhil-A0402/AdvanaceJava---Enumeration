package enumerations;

public enum Level {
    HIGH {
        @Override
        public String asLowerCase() {
            return HIGH.toString().toLowerCase();
        }
        @Override
        public String asUpperCase() {
            return HIGH.toString().toUpperCase();
        }
    },
    MEDIUM{
        @Override
        public String asLowerCase() {
            return MEDIUM.toString().toLowerCase();
        }
        @Override
        public String asUpperCase() {
            return MEDIUM.toString().toUpperCase();
        }
    },
    LOW {
        @Override
        public String asLowerCase() {
            return LOW.toString().toLowerCase();
        }
        @Override
        public String asUpperCase() {
            return LOW.toString().toUpperCase();
        }
    };

    // abstract method
    public abstract String asLowerCase();
    public abstract String asUpperCase();
}
