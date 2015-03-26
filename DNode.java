
public class DNode<T>
{
	public T value;
	public DNode<T> prev;
	public DNode<T> next;
	public DNode()
	{
		value=null;
		prev=this;
		next=this;
	}
	public DNode(T item)
	{
		value=item;
		prev=this;
		next=this;
	}
}
