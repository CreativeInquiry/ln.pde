// Generated by Haxe 4.1.3
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Std
{
	public Std()
	{
	}
	
	
	public static boolean isOfType(java.lang.Object v, java.lang.Object t)
	{
		//line 32 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		if (( v == null )) 
		{
			//line 33 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			return false;
		}
		
		//line 34 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		if (( t == null )) 
		{
			//line 35 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			return false;
		}
		
		//line 36 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		java.lang.Class clt = ((java.lang.Class) (t) );
		//line 37 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		if (( ((java.lang.Object) (clt) ) == ((java.lang.Object) (null) ) )) 
		{
			//line 38 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			return false;
		}
		
		//line 39 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		java.lang.String name = clt.getName();
		//line 41 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		{
			//line 41 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			java.lang.String __temp_svar1 = (name);
			//line 41 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			int __temp_hash3 = __temp_svar1.hashCode();
			//line 41 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			if (( __temp_svar1 != null )) 
			{
				//line 41 "/usr/local/lib/haxe/std/java/_std/Std.hx"
				switch (__temp_hash3)
				{
					case 344809556:
					case 64711720:
					{
						//line 47 "/usr/local/lib/haxe/std/java/_std/Std.hx"
						if (( (( ( __temp_hash3 == 344809556 ) && __temp_svar1.equals("java.lang.Boolean") )) || __temp_svar1.equals("boolean") )) 
						{
							//line 47 "/usr/local/lib/haxe/std/java/_std/Std.hx"
							return v instanceof java.lang.Boolean;
						}
						
						//line 47 "/usr/local/lib/haxe/std/java/_std/Std.hx"
						break;
					}
					
					
					case 1063877011:
					{
						//line 49 "/usr/local/lib/haxe/std/java/_std/Std.hx"
						if (__temp_svar1.equals("java.lang.Object")) 
						{
							//line 49 "/usr/local/lib/haxe/std/java/_std/Std.hx"
							return true;
						}
						
						//line 49 "/usr/local/lib/haxe/std/java/_std/Std.hx"
						break;
					}
					
					
					case 761287205:
					case -1325958191:
					{
						//line 43 "/usr/local/lib/haxe/std/java/_std/Std.hx"
						if (( (( ( __temp_hash3 == 761287205 ) && __temp_svar1.equals("java.lang.Double") )) || __temp_svar1.equals("double") )) 
						{
							//line 43 "/usr/local/lib/haxe/std/java/_std/Std.hx"
							return haxe.lang.Runtime.isDouble(v);
						}
						
						//line 43 "/usr/local/lib/haxe/std/java/_std/Std.hx"
						break;
					}
					
					
					case -2056817302:
					case 104431:
					{
						//line 45 "/usr/local/lib/haxe/std/java/_std/Std.hx"
						if (( (( ( __temp_hash3 == -2056817302 ) && __temp_svar1.equals("java.lang.Integer") )) || __temp_svar1.equals("int") )) 
						{
							//line 45 "/usr/local/lib/haxe/std/java/_std/Std.hx"
							return haxe.lang.Runtime.isInt(v);
						}
						
						//line 45 "/usr/local/lib/haxe/std/java/_std/Std.hx"
						break;
					}
					
					
				}
				
			}
			
		}
		
		//line 52 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		java.lang.Class clv = v.getClass();
		//line 54 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		return clt.isAssignableFrom(((java.lang.Class) (clv) ));
	}
	
	
	public static java.lang.String string(java.lang.Object s)
	{
		//line 58 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		return ( haxe.lang.Runtime.toString(s) + "" );
	}
	
	
	public static int _int(double x)
	{
		//line 62 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		return ((int) (x) );
	}
	
	
	public static java.lang.Object parseInt(java.lang.String x)
	{
		//line 65 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		try 
		{
			//line 66 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			if (( x == null )) 
			{
				//line 67 "/usr/local/lib/haxe/std/java/_std/Std.hx"
				return null;
			}
			
			//line 69 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			int base = 10;
			//line 70 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			int len = x.length();
			//line 71 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			int foundCount = 0;
			//line 72 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			int sign = 0;
			//line 73 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			int firstDigitIndex = 0;
			//line 74 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			int lastDigitIndex = -1;
			//line 75 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			int previous = 0;
			//line 77 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			{
				//line 77 "/usr/local/lib/haxe/std/java/_std/Std.hx"
				int _g = 0;
				//line 77 "/usr/local/lib/haxe/std/java/_std/Std.hx"
				int _g1 = len;
				//line 77 "/usr/local/lib/haxe/std/java/_std/Std.hx"
				label1:
				while (( _g < _g1 ))
				{
					//line 77 "/usr/local/lib/haxe/std/java/_std/Std.hx"
					int i = _g++;
					//line 78 "/usr/local/lib/haxe/std/java/_std/Std.hx"
					int c = ( (( i < x.length() )) ? (((int) (((java.lang.String) (((java.lang.Object) (x) )) ).charAt(i)) )) : (-1) );
					//line 79 "/usr/local/lib/haxe/std/java/_std/Std.hx"
					if (( ( ( c > 8 ) && ( c < 14 ) ) || ( c == 32 ) )) 
					{
						//line 81 "/usr/local/lib/haxe/std/java/_std/Std.hx"
						if (( foundCount > 0 )) 
						{
							//line 82 "/usr/local/lib/haxe/std/java/_std/Std.hx"
							return null;
						}
						
						//line 84 "/usr/local/lib/haxe/std/java/_std/Std.hx"
						continue;
					}
					else
					{
						//line 79 "/usr/local/lib/haxe/std/java/_std/Std.hx"
						switch (c)
						{
							case 43:
							{
								//line 87 "/usr/local/lib/haxe/std/java/_std/Std.hx"
								if (( foundCount == 0 )) 
								{
									//line 88 "/usr/local/lib/haxe/std/java/_std/Std.hx"
									sign = 1;
								}
								else
								{
									//line 92 "/usr/local/lib/haxe/std/java/_std/Std.hx"
									if ( ! ((( ( 48 <= c ) && ( c <= 57 ) ))) ) 
									{
										//line 93 "/usr/local/lib/haxe/std/java/_std/Std.hx"
										if ( ! ((( ( base == 16 ) && (( ( ( 97 <= c ) && ( c <= 122 ) ) || ( ( 65 <= c ) && ( c <= 90 ) ) )) ))) ) 
										{
											//line 95 "/usr/local/lib/haxe/std/java/_std/Std.hx"
											break label1;
										}
										
									}
									
								}
								
								//line 87 "/usr/local/lib/haxe/std/java/_std/Std.hx"
								break;
							}
							
							
							case 45:
							{
								//line 85 "/usr/local/lib/haxe/std/java/_std/Std.hx"
								if (( foundCount == 0 )) 
								{
									//line 86 "/usr/local/lib/haxe/std/java/_std/Std.hx"
									sign = -1;
								}
								else
								{
									//line 92 "/usr/local/lib/haxe/std/java/_std/Std.hx"
									if ( ! ((( ( 48 <= c ) && ( c <= 57 ) ))) ) 
									{
										//line 93 "/usr/local/lib/haxe/std/java/_std/Std.hx"
										if ( ! ((( ( base == 16 ) && (( ( ( 97 <= c ) && ( c <= 122 ) ) || ( ( 65 <= c ) && ( c <= 90 ) ) )) ))) ) 
										{
											//line 95 "/usr/local/lib/haxe/std/java/_std/Std.hx"
											break label1;
										}
										
									}
									
								}
								
								//line 85 "/usr/local/lib/haxe/std/java/_std/Std.hx"
								break;
							}
							
							
							case 48:
							{
								//line 89 "/usr/local/lib/haxe/std/java/_std/Std.hx"
								if ( ! ((( ( foundCount == 0 ) || ( ( foundCount == 1 ) && ( sign != 0 ) ) ))) ) 
								{
									//line 92 "/usr/local/lib/haxe/std/java/_std/Std.hx"
									if ( ! ((( ( 48 <= c ) && ( c <= 57 ) ))) ) 
									{
										//line 93 "/usr/local/lib/haxe/std/java/_std/Std.hx"
										if ( ! ((( ( base == 16 ) && (( ( ( 97 <= c ) && ( c <= 122 ) ) || ( ( 65 <= c ) && ( c <= 90 ) ) )) ))) ) 
										{
											//line 95 "/usr/local/lib/haxe/std/java/_std/Std.hx"
											break label1;
										}
										
									}
									
								}
								
								//line 89 "/usr/local/lib/haxe/std/java/_std/Std.hx"
								break;
							}
							
							
							case 88:
							case 120:
							{
								//line 90 "/usr/local/lib/haxe/std/java/_std/Std.hx"
								if (( ( previous == 48 ) && (( ( ( foundCount == 1 ) && ( sign == 0 ) ) || ( ( foundCount == 2 ) && ( sign != 0 ) ) )) )) 
								{
									//line 91 "/usr/local/lib/haxe/std/java/_std/Std.hx"
									base = 16;
								}
								else
								{
									//line 92 "/usr/local/lib/haxe/std/java/_std/Std.hx"
									if ( ! ((( ( 48 <= c ) && ( c <= 57 ) ))) ) 
									{
										//line 93 "/usr/local/lib/haxe/std/java/_std/Std.hx"
										if ( ! ((( ( base == 16 ) && (( ( ( 97 <= c ) && ( c <= 122 ) ) || ( ( 65 <= c ) && ( c <= 90 ) ) )) ))) ) 
										{
											//line 95 "/usr/local/lib/haxe/std/java/_std/Std.hx"
											break label1;
										}
										
									}
									
								}
								
								//line 90 "/usr/local/lib/haxe/std/java/_std/Std.hx"
								break;
							}
							
							
							default:
							{
								//line 92 "/usr/local/lib/haxe/std/java/_std/Std.hx"
								if ( ! ((( ( 48 <= c ) && ( c <= 57 ) ))) ) 
								{
									//line 93 "/usr/local/lib/haxe/std/java/_std/Std.hx"
									if ( ! ((( ( base == 16 ) && (( ( ( 97 <= c ) && ( c <= 122 ) ) || ( ( 65 <= c ) && ( c <= 90 ) ) )) ))) ) 
									{
										//line 95 "/usr/local/lib/haxe/std/java/_std/Std.hx"
										break label1;
									}
									
								}
								
								//line 92 "/usr/local/lib/haxe/std/java/_std/Std.hx"
								break;
							}
							
						}
						
					}
					
					//line 97 "/usr/local/lib/haxe/std/java/_std/Std.hx"
					if (( ( ( foundCount == 0 ) && ( sign == 0 ) ) || ( ( foundCount == 1 ) && ( sign != 0 ) ) )) 
					{
						//line 98 "/usr/local/lib/haxe/std/java/_std/Std.hx"
						firstDigitIndex = i;
					}
					
					//line 100 "/usr/local/lib/haxe/std/java/_std/Std.hx"
					 ++ foundCount;
					//line 101 "/usr/local/lib/haxe/std/java/_std/Std.hx"
					lastDigitIndex = i;
					//line 102 "/usr/local/lib/haxe/std/java/_std/Std.hx"
					previous = c;
				}
				;
			}
			
			//line 104 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			if (( firstDigitIndex <= lastDigitIndex )) 
			{
				//line 105 "/usr/local/lib/haxe/std/java/_std/Std.hx"
				java.lang.String digits = haxe.lang.StringExt.substring(x, ( firstDigitIndex + (( (( base == 16 )) ? (2) : (0) )) ), ( lastDigitIndex + 1 ));
				//line 107 "/usr/local/lib/haxe/std/java/_std/Std.hx"
				try 
				{
					//line 107 "/usr/local/lib/haxe/std/java/_std/Std.hx"
					return ( (( (( sign == -1 )) ? (-1) : (1) )) * java.lang.Integer.parseInt(haxe.lang.Runtime.toString(digits), ((int) (base) )) );
				}
				catch (java.lang.NumberFormatException e)
				{
					//line 109 "/usr/local/lib/haxe/std/java/_std/Std.hx"
					return null;
				}
				
				
			}
			
			//line 112 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			return null;
		}
		catch (java.lang.Throwable typedException)
		{
			//line 65 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			throw ((java.lang.RuntimeException) (haxe.Exception.thrown(typedException)) );
		}
		
		
	}
	
	
	public static double parseFloat(java.lang.String x)
	{
		//line 116 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		if (( x == null )) 
		{
			//line 117 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			return java.lang.Double.NaN;
		}
		
		//line 118 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		x = haxe.root.StringTools.ltrim(x);
		//line 119 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		boolean found = false;
		//line 119 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		boolean hasDot = false;
		//line 119 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		boolean hasSign = false;
		//line 119 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		boolean hasE = false;
		//line 119 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		boolean hasESign = false;
		//line 119 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		boolean hasEData = false;
		//line 125 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		int i = -1;
		//line 129 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		label1:
		while ((  ++ i < x.length() ))
		{
			//line 130 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			int chr = ((int) (x.charAt(i)) );
			//line 131 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			if (( ( chr >= 48 ) && ( chr <= 57 ) )) 
			{
				//line 132 "/usr/local/lib/haxe/std/java/_std/Std.hx"
				if (hasE) 
				{
					//line 133 "/usr/local/lib/haxe/std/java/_std/Std.hx"
					hasEData = true;
				}
				
				//line 135 "/usr/local/lib/haxe/std/java/_std/Std.hx"
				found = true;
			}
			else
			{
				//line 137 "/usr/local/lib/haxe/std/java/_std/Std.hx"
				switch (chr)
				{
					case 43:
					case 45:
					{
						//line 142 "/usr/local/lib/haxe/std/java/_std/Std.hx"
						if ((  ! (found)  &&  ! (hasSign)  )) 
						{
							//line 143 "/usr/local/lib/haxe/std/java/_std/Std.hx"
							hasSign = true;
						}
						else
						{
							//line 144 "/usr/local/lib/haxe/std/java/_std/Std.hx"
							if (( ( ( found &&  ! (hasESign)  ) && hasE ) &&  ! (hasEData)  )) 
							{
								//line 145 "/usr/local/lib/haxe/std/java/_std/Std.hx"
								hasESign = true;
							}
							else
							{
								//line 147 "/usr/local/lib/haxe/std/java/_std/Std.hx"
								break label1;
							}
							
						}
						
						//line 142 "/usr/local/lib/haxe/std/java/_std/Std.hx"
						break;
					}
					
					
					case 46:
					{
						//line 140 "/usr/local/lib/haxe/std/java/_std/Std.hx"
						if ( ! (hasDot) ) 
						{
							//line 141 "/usr/local/lib/haxe/std/java/_std/Std.hx"
							hasDot = true;
						}
						else
						{
							//line 147 "/usr/local/lib/haxe/std/java/_std/Std.hx"
							break label1;
						}
						
						//line 140 "/usr/local/lib/haxe/std/java/_std/Std.hx"
						break;
					}
					
					
					case 69:
					case 101:
					{
						//line 138 "/usr/local/lib/haxe/std/java/_std/Std.hx"
						if ( ! (hasE) ) 
						{
							//line 139 "/usr/local/lib/haxe/std/java/_std/Std.hx"
							hasE = true;
						}
						else
						{
							//line 147 "/usr/local/lib/haxe/std/java/_std/Std.hx"
							break label1;
						}
						
						//line 138 "/usr/local/lib/haxe/std/java/_std/Std.hx"
						break;
					}
					
					
					default:
					{
						//line 147 "/usr/local/lib/haxe/std/java/_std/Std.hx"
						break label1;
					}
					
				}
				
			}
			
		}
		;
		//line 150 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		if (( hasE &&  ! (hasEData)  )) 
		{
			//line 151 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			 -- i;
			//line 152 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			if (hasESign) 
			{
				//line 153 "/usr/local/lib/haxe/std/java/_std/Std.hx"
				 -- i;
			}
			
		}
		
		//line 156 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		if (( i != x.length() )) 
		{
			//line 157 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			x = haxe.lang.StringExt.substr(x, 0, i);
		}
		
		//line 159 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		try 
		{
			//line 159 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			return java.lang.Double.parseDouble(haxe.lang.Runtime.toString(x));
		}
		catch (java.lang.Throwable _g)
		{
			//line 159 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			return java.lang.Double.NaN;
		}
		
		
	}
	
	
	public static int random(int x)
	{
		//line 172 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		if (( x <= 0 )) 
		{
			//line 173 "/usr/local/lib/haxe/std/java/_std/Std.hx"
			return 0;
		}
		
		//line 174 "/usr/local/lib/haxe/std/java/_std/Std.hx"
		return ((int) (( java.lang.Math.random() * x )) );
	}
	
	
}


