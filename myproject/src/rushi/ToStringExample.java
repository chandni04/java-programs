package rushi;

import java.util.Date;

class Person
{
	private String name;
	private int age;
	private Date birthDate;

	public Person(String name, int age, Date birthDate)
	{
		super();
		this.name = name;
		this.age = age;
		this.birthDate = birthDate;
	}

	@Override
	public String toString()
	{
		return "Person [name=" + name + ", age=" + age + ", birthDate=" + birthDate + "]";
	}
}

public class ToStringExample
{
	public static void main(String[] args)
	{
		Person person = new Person("Chandni", 56, new Date());
		System.out.println(person);
	}

}