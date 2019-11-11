package pract;

public class B
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("first");
			try
			{
				System.out.println("second");
				try
				{
					System.out.println("third");
					try
					{
						System.out.println("four");
						try
						{
							System.out.println("fifth");

						} catch (Exception e)
						{
							// TODO: handle exception
						}

					} catch (Exception e)
					{
						// TODO: handle exception
					}

				} catch (Exception e)
				{
					// TODO: handle exception
				}

			} catch (Exception e)
			{
				// TODO: handle exception
			}

		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}
