package April18;

class Person {
	int id;
	String name;
	Job job;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person : " + "Id- " + id + " " + " Name - " + name + " " + " Job - " + job;
	}

}

class Job {
	int jobId;
	String profile;
	JoiningDate joiningDate;

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public JoiningDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(JoiningDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "\nJob : " + "Job ID - " + jobId + " " + "Job Profile - " + profile + " " + " Joining Date - "
				+ joiningDate;
	}

}

class JoiningDate {
	int day, month, year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "\nJoiningDate : " + day + " " + month + " " + year;
	}

}

public class ContainmentDemo {

	public static void main(String[] args) {

		Person obj = new Person();
		obj.setId(1);
		obj.setJob(new Job());
		obj.setName("Pratik");

		Job jobInstance = obj.getJob();
		jobInstance.setJobId(101);
		jobInstance.setJoiningDate(new JoiningDate());
		jobInstance.setProfile("devloper");

		jobInstance.getJoiningDate().setDay(10);
		jobInstance.getJoiningDate().setMonth(12);
		jobInstance.getJoiningDate().setYear(2023);

//		JoiningDate j = jobInstance.getJoiningDate();
//		j.setDay(10);
//		j.setMonth(2);
//		j.setYear(2023);

		System.out.println(obj);

//		System.out.println(j.getDay());
//		System.out.println(j.toString());
//		System.out.println(jobInstance.toString());
	}

}
