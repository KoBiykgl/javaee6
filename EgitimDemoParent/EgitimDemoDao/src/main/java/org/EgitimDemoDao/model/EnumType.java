package org.EgitimDemoDao.model;

public class EnumType {

	public enum GenderType {

		MALE("M"), FEMALE("F");

		private String gender;

		private GenderType(String gender) {
			this.gender = gender;
		}

		public static GenderType getType(String gender) {

			if (gender == null) {
				return null;
			}

			for (GenderType genderType : GenderType.values()) {
				if (gender.equals(genderType.getGender())) {
					return genderType;
				}
			}
			throw new IllegalArgumentException("No matching type for gender "
					+ gender);
		}

		public String getGender() {
			return gender;
		}
	}

}
