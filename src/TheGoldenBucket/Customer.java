package TheGoldenBucket;

    public class Customer  {
        private String name;
        private String date;



        private String time;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public Customer(String name){

            this.name = name;
        }

        public String getName() {

            return name;
        }

        public void setName(String name) {

            this.name = name;
        }
}
