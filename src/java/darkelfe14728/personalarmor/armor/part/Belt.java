package darkelfe14728.personalarmor.armor.part;

/**
 * @author Julien Rosset
 * 
 *         Armor belt part.
 */
public class Belt
    implements IArmorPart
{
    @Override
    public String getTagName()
    {
        return "belt";
    }

    /**
     * @see darkelfe14728.personalarmor.armor.part.IArmorPart#getBaseFactor()
     */
    @Override
    public int getBaseFactor()
    {
        return 80;
    }
}
