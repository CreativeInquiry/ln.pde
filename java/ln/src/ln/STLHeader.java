// Generated by Haxe 4.1.3
package ln;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class STLHeader extends haxe.lang.HxObject
{
	public STLHeader(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public STLHeader(haxe.root.Array<java.lang.Object> __0, java.lang.Object _Count)
	{
		//line 9 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
		ln.STLHeader.__hx_ctor_ln_STLHeader(this, __0, _Count);
	}
	
	
	protected static void __hx_ctor_ln_STLHeader(ln.STLHeader __hx_this, haxe.root.Array<java.lang.Object> __0, java.lang.Object _Count)
	{
		//line 8 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
		__hx_this.Count = 0;
		//line 7 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
		__hx_this._0 = new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{});
		//line 9 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
		{
			//line 9 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
			int _Count1 = ( (haxe.lang.Runtime.eq(_Count, null)) ? (0) : (((int) (haxe.lang.Runtime.toInt(_Count)) )) );
			//line 10 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
			__hx_this._0 = __0;
			//line 11 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
			__hx_this.Count = _Count1;
		}
		
	}
	
	
	public haxe.root.Array<java.lang.Object> _0;
	
	public int Count;
	
	public ln.STLHeader _clone()
	{
		//line 14 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
		return new ln.STLHeader(this._0, this.Count);
	}
	
	
	@Override public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
		{
			//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
			if (( field != null )) 
			{
				//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
				switch (field.hashCode())
				{
					case 65298671:
					{
						//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
						if (field.equals("Count")) 
						{
							//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
							__temp_executeDef1 = false;
							//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
							this.Count = ((int) (value) );
							//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
							return value;
						}
						
						//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
				return super.__hx_setField_f(field, value, handleProperties);
			}
			else
			{
				//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
		{
			//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
			if (( field != null )) 
			{
				//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
				switch (field.hashCode())
				{
					case 65298671:
					{
						//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
						if (field.equals("Count")) 
						{
							//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
							__temp_executeDef1 = false;
							//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
							this.Count = ((int) (haxe.lang.Runtime.toInt(value)) );
							//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
							return value;
						}
						
						//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
						break;
					}
					
					
					case 2993:
					{
						//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
						if (field.equals("_0")) 
						{
							//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
							__temp_executeDef1 = false;
							//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
							this._0 = ((haxe.root.Array<java.lang.Object>) (value) );
							//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
							return value;
						}
						
						//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
				return super.__hx_setField(field, value, handleProperties);
			}
			else
			{
				//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
		{
			//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
			if (( field != null )) 
			{
				//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
				switch (field.hashCode())
				{
					case -1480441762:
					{
						//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
						if (field.equals("_clone")) 
						{
							//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
							__temp_executeDef1 = false;
							//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
							return ((haxe.lang.Function) (new haxe.lang.Closure(this, "_clone")) );
						}
						
						//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
						break;
					}
					
					
					case 2993:
					{
						//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
						if (field.equals("_0")) 
						{
							//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
							__temp_executeDef1 = false;
							//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
							return this._0;
						}
						
						//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
						break;
					}
					
					
					case 65298671:
					{
						//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
						if (field.equals("Count")) 
						{
							//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
							__temp_executeDef1 = false;
							//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
							return this.Count;
						}
						
						//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			else
			{
				//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
		{
			//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
			if (( field != null )) 
			{
				//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
				switch (field.hashCode())
				{
					case 65298671:
					{
						//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
						if (field.equals("Count")) 
						{
							//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
							__temp_executeDef1 = false;
							//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
							return ((double) (this.Count) );
						}
						
						//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			else
			{
				//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public java.lang.Object __hx_invokeField(java.lang.String field, java.lang.Object[] dynargs)
	{
		//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
		{
			//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
			boolean __temp_executeDef1 = true;
			//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
			if (( field != null )) 
			{
				//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
				switch (field.hashCode())
				{
					case -1480441762:
					{
						//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
						if (field.equals("_clone")) 
						{
							//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
							__temp_executeDef1 = false;
							//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
							return this._clone();
						}
						
						//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
						break;
					}
					
					
				}
				
			}
			
			//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
			if (__temp_executeDef1) 
			{
				//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
				return super.__hx_invokeField(field, dynargs);
			}
			else
			{
				//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
				throw null;
			}
			
		}
		
	}
	
	
	@Override public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
		baseArr.push("Count");
		//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
		baseArr.push("_0");
		//line 6 "/Users/lingdonghuang/proj/go2json/ln/STLHeader.hx"
		super.__hx_getFields(baseArr);
	}
	
	
}


