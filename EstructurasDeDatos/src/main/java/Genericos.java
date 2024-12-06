public class Genericos {
    static class Cajita<T>{
        private T content;

        public Cajita(T content){
            this.content = content;
        }

        public T getContent() {
            return content;
        }

        public void setContent(T content) {
            this.content = content;
        }
    }

    public static void main(String[] args) {
        Cajita<String> stringCajita = new Cajita<>("jalex");
    }
}
