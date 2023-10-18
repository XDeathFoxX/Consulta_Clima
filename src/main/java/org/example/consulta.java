package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
public class consulta {
    public static class Main {
        private Main main;

        private Double temp;

        @JsonProperty("feels_like")
        private Double feels_like;

        public Double getTemp() {
            return temp;
        }

        public void setTemp(Double temp) {
            this.temp = temp;
        }

        public Double getFeelsLike() {
            return feels_like;
        }

        public void setFeelsLike(Double feels_like) {
            this.feels_like = feels_like;
        }
    }
}
