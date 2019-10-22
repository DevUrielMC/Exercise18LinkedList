package com.exercise18linkedlist.app;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.Random;
import java.util.HashMap;
import java.util.Iterator;

public class LinkedListApp 
{

	public static void main(String[] args) 
	{
		//constante
		final int ELEMENTS=100;
		
		Random numbers= new Random();
		
		LinkedList <Byte> miListita =new LinkedList <Byte>(); //Byte generics clase wrapper
		ArrayList<Byte> miArraycito=  new ArrayList<Byte>();
		Stack <Integer> miPilita= new Stack <Integer>();
		PriorityQueue <Integer> miColita= new PriorityQueue <Integer>();
		HashMap<Integer,String> MiDiccionaritu=  new HashMap<Integer,String>();
		
		miListita.add((byte) 5);
		miListita.add((byte) 10);
		miListita.add((byte) 20);
		miListita.add((byte) 30);
		miListita.add((byte) 40);
		miListita.set(0,(byte)2);//sustituir el valor
		System.out.println(miListita.get(1));//obtiene un valor
		System.out.println(miListita);//muestra
		/*System.out.println(miListita.remove()); //se va al ultimo elemento lo extrae y lo quita de la coleccion
		System.out.println(miListita.remove());
		System.out.println(miListita.remove());
		System.out.println(miListita.remove());
		System.out.println(miListita.remove());*/
		System.out.println(miListita.size());
		System.out.println(miListita.isEmpty());
		System.out.println(miListita.contains(2));
		
		miListita.clear();
		System.out.println(miListita);//lista vacia
		
		for(int i=0;i<ELEMENTS;i++)
		{
			miListita.add((byte)numbers.nextInt(100));
		}
		System.out.println(miListita);
		
		//clase que permite la repeticion de un proceso 
		Iterator miIteradorcitu= miListita.iterator(); 		//clase que permite
		while(miIteradorcitu.hasNext())						//revisa si hay un elemento mas ahi 
		{
			System.out.println(miIteradorcitu.next());		//
		}
		for(Byte miNumber: miListita)
		{
			System.out.println(miNumber);
		}
		
		
		
		//ARRAYS
		miArraycito.add((short)5);
		miArraycito.add((short)10);
		miArraycito.add((short)30);
		miArraycito.add((short)40);
		miArraycito.add((short)50);
		System.out.println(miArraycito);
		
		miArraycito.set(0,(short)2);
		
		System.out.println(miArraycito.get(2));
		System.out.println(miArraycito);
		System.out.println(miIteradorcitu.remove(2));
		System.out.println(miIteradorcitu);
		
		miIteradorcitu= miArraycito.iterator(); 		//clase que permite
		while(miIteradorcitu.hasNext())						//revisa si hay un elemento mas ahi 
		{
			System.out.println(miIteradorcitu.next());		//
		}
		for(Byte miShort: miArraycito)
		{
			System.out.println(miShort);
		}
	}

}
