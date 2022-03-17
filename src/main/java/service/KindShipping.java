package service;

import service.frete.Express;
import service.frete.Normal;

public enum KindShipping {

    NORMAL {
        @Override
        public Shipping obtainShipping() {
            return new Normal();
        }
    },
    SEDEX {
        @Override
        public Shipping obtainShipping() {
            return new Express();
        }
    };

    public abstract Shipping obtainShipping();
}
