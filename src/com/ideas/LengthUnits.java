package com.ideas;

public enum LengthUnits {
	CENTIMETER {
		@Override
		public double standardConversion() {
			return 0.01;
		}

		@Override
		public double reverseConversion() {
			// TODO Auto-generated method stub
			return 100;
		}
	},
	INCHES {
		@Override
		public double standardConversion() {
			return 0.0254;
		}

		@Override
		public double reverseConversion() {
			// TODO Auto-generated method stub
			return 39.37;
		}
	},
	FOOT {
		@Override
		public double standardConversion() {
			// TODO Auto-generated method stub
			return 0.304;
		}

		@Override
		public double reverseConversion() {
			// TODO Auto-generated method stub
			return 3.28;
		}
	},
	METER {
		@Override
		public double standardConversion() {
			return 1.0;
		}

		@Override
		public double reverseConversion() {
			// TODO Auto-generated method stub
			return 0;
		}
	},
	KILOMETER {
		@Override
		public double standardConversion() {
			return 1000.0;
		}

		@Override
		public double reverseConversion() {
			// TODO Auto-generated method stub
			return 0.001;
		}
	};
	
	private LengthUnits() {
		
	}
	public abstract double standardConversion() ;
	public abstract double reverseConversion() ;

}
