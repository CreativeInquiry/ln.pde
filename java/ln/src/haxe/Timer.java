// Generated by Haxe 4.1.3
package haxe;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Timer extends haxe.lang.HxObject
{
	public Timer(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Timer(int time_ms)
	{
		//line 60 "/usr/local/lib/haxe/std/haxe/Timer.hx"
		haxe.Timer.__hx_ctor_haxe_Timer(this, time_ms);
	}
	
	
	protected static void __hx_ctor_haxe_Timer(haxe.Timer __hx_this, int time_ms)
	{
		//line 128 "/usr/local/lib/haxe/std/haxe/Timer.hx"
		__hx_this.run = ( (( haxe.Timer___hx_ctor_haxe_Timer_128__Fun.__hx_current != null )) ? (haxe.Timer___hx_ctor_haxe_Timer_128__Fun.__hx_current) : (haxe.Timer___hx_ctor_haxe_Timer_128__Fun.__hx_current = ((haxe.Timer___hx_ctor_haxe_Timer_128__Fun) (new haxe.Timer___hx_ctor_haxe_Timer_128__Fun()) )) );
		//line 60 "/usr/local/lib/haxe/std/haxe/Timer.hx"
		{
			//line 70 "/usr/local/lib/haxe/std/haxe/Timer.hx"
			__hx_this.timer = new java.util.Timer();
			//line 71 "/usr/local/lib/haxe/std/haxe/Timer.hx"
			__hx_this.timer.scheduleAtFixedRate(((java.util.TimerTask) (__hx_this.task = new haxe._Timer.TimerTask(__hx_this)) ), ((long) (time_ms) ), ((long) (time_ms) ));
		}
		
	}
	
	
	public java.util.Timer timer;
	
	public java.util.TimerTask task;
	
	public haxe.lang.Function run;
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
		{
			//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
			boolean __temp_executeDef1 = true;
			//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
			if (( field != null )) 
			{
				//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
				switch (field.hashCode())
				{
					case 113291:
					{
						//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
						if (field.equals("run")) 
						{
							//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
							__temp_executeDef1 = false;
							//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
							this.run = ((haxe.lang.Function) (value) );
							//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
							return value;
						}
						
						//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
						break;
					}
					
					
					case 110364485:
					{
						//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
						if (field.equals("timer")) 
						{
							//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
							__temp_executeDef1 = false;
							//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
							this.timer = ((java.util.Timer) (value) );
							//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
							return value;
						}
						
						//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
						break;
					}
					
					
					case 3552645:
					{
						//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
						if (field.equals("task")) 
						{
							//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
							__temp_executeDef1 = false;
							//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
							this.task = ((java.util.TimerTask) (value) );
							//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
							return value;
						}
						
						//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
			if (__temp_executeDef1) 
			{
				//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
		{
			//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
			boolean __temp_executeDef1 = true;
			//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
			if (( field != null )) 
			{
				//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
				switch (field.hashCode())
				{
					case 113291:
					{
						//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
						if (field.equals("run")) 
						{
							//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
							__temp_executeDef1 = false;
							//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
							return this.run;
						}
						
						//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
						break;
					}
					
					
					case 110364485:
					{
						//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
						if (field.equals("timer")) 
						{
							//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
							__temp_executeDef1 = false;
							//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
							return this.timer;
						}
						
						//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
						break;
					}
					
					
					case 3552645:
					{
						//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
						if (field.equals("task")) 
						{
							//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
							__temp_executeDef1 = false;
							//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
							return this.task;
						}
						
						//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
			if (__temp_executeDef1) 
			{
				//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
		baseArr.push("run");
		//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
		baseArr.push("task");
		//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
		baseArr.push("timer");
		//line 39 "/usr/local/lib/haxe/std/haxe/Timer.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


